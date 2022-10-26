package hui.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/test")
public class testServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");

        Enumeration<String> headerNames = req.getHeaderNames();             //* Enumeration<String> getHeaderNames()方法
        System.out.println("====================================");
        System.out.println("请求头数据:");
        while (headerNames.hasMoreElements()){
            String headerName = headerNames.nextElement();
            String header = req.getHeader(headerName);                      //* String getHeader(String name)方法
            System.out.println("    " + headerName + "=" + header);
        }
        System.out.println("请求体数据");
        BufferedReader reader = req.getReader();                                    //* getReader()方法, 获取字符输入流

        String line;
        while ((line = reader.readLine()) != null){
            System.out.println("    " + line);
        }
        System.out.println("------------------------------------");

        resp.getWriter().write("'data': 'print successful'");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
