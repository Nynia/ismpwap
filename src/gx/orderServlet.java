package gx;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;

import javax.tools.Tool;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Created by Ridiculous on 2016/8/24.
 */
public class orderServlet extends javax.servlet.http.HttpServlet {
    static Logger logger = Logger.getLogger(orderServlet.class.getName());
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        String phoneNum = request.getParameter("phoneNum");
        String productId = request.getParameter("productId");
        String remoteIp = request.getRemoteHost();
        String resultCode = "";
        logger.info("*******************************************************");
        logger.info(action);
        logger.info(phoneNum);
        logger.info(productId);
        logger.info(remoteIp);

        if (action != null && action.equals("subscribe")) {
            if (phoneNum == null || productId == null) {
                resultCode = "150";
            } else {
                try {
                    resultCode = Tools.subscribe(phoneNum, productId);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (action != null && action.equals("unsubscribe")) {
            if (phoneNum == null || productId == null) {
                resultCode = "150";
            } else {
                try {
                    resultCode = Tools.unsubscribe(phoneNum, productId);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            resultCode = "150";
        }
        if (resultCode.equals("")) {
            resultCode = "162";
        }

        // ********************************************************************
        // JDBC driver name and database URL
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost:3306/ismpwap";
        // ***********************************************************************
        // Database credentials
        final String USER = "root";
        final String PASS = "admin";
        Connection conn = null;
        Statement stmt = null;
        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // connection to mySQL server and  Open a connection
            logger.info("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            logger.info("Connected database successfully...");

            // create a Statement object ()
            System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();

            //  Execute a query
            String sql = "INSERT INTO order_record"
                    + "(id,product_id,phone_num,action,result_code,result_msg,remote_ip,create_time)" +
                    "VALUES(0,'" + productId + "'," +
                    "'" + phoneNum + "'," +
                    "'" + action + "'," +
                    "'" + resultCode + "'," +
                    "'" +  Constants.resultCodeMap.get(resultCode) + "'," +
                    "'" + remoteIp + "'," +
                    "'" + Tools.getTimestamp() + "'" +
                    ")";
            stmt.executeUpdate(sql);
            logger.info("database insert successfull");

        } catch (Exception e) {
            e.printStackTrace();
        }

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();

        JSONObject jsonresult = new JSONObject();
        jsonresult.put("err_code", resultCode);
        jsonresult.put("err_msg", Constants.resultCodeMap.get(resultCode));
        logger.info("result" + jsonresult.toString());
        pw.write(jsonresult.toString());
    }
}
