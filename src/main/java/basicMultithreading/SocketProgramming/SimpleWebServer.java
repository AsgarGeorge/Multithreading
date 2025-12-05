package basicMultithreading.SocketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {
    public static void main(String[] args) throws IOException {



        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server listening on port 8080...");

        while (true) {

            Socket clientSocket = serverSocket.accept();

            // 4. Read the client request (usually just the first line for a basic GET)
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String requestLine = in.readLine();
            System.out.println("Received: " + requestLine);


            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);


            out.println("HTTP/1.1 200 OK");

            out.println("Content-Type: text/html");
            out.println();


            //out.println("<html><body><h1>HELLO WORLD</h1></body></html>");

            out.println(
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <title>About Us - [Your Company/Website Name]</title>\n" +
                    "    <style>\n" +
                    "        /* Basic CSS for a clean look */\n" +
                    "        body {\n" +
                    "            font-family: Arial, sans-serif;\n" +
                    "            line-height: 1.6;\n" +
                    "            margin: 0;\n" +
                    "            padding: 0;\n" +
                    "            background-color: #f4f4f4;\n" +
                    "            color: #333;\n" +
                    "        }\n" +
                    "        header {\n" +
                    "            background: #333;\n" +
                    "            color: #fff;\n" +
                    "            padding: 1em 0;\n" +
                    "            text-align: center;\n" +
                    "        }\n" +
                    "        header h1 {\n" +
                    "            margin: 0;\n" +
                    "        }\n" +
                    "        .container {\n" +
                    "            width: 80%;\n" +
                    "            margin: auto;\n" +
                    "            overflow: hidden;\n" +
                    "            padding: 20px 0;\n" +
                    "        }\n" +
                    "        section {\n" +
                    "            padding: 20px;\n" +
                    "            margin-bottom: 20px;\n" +
                    "            background: #fff;\n" +
                    "            border-radius: 8px;\n" +
                    "            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n" +
                    "        }\n" +
                    "        section h2 {\n" +
                    "            color: #007bff;\n" +
                    "            border-bottom: 2px solid #007bff;\n" +
                    "            padding-bottom: 10px;\n" +
                    "            margin-bottom: 15px;\n" +
                    "        }\n" +
                    "        .team-member {\n" +
                    "            display: flex;\n" +
                    "            align-items: center;\n" +
                    "            margin-bottom: 15px;\n" +
                    "        }\n" +
                    "        .team-member img {\n" +
                    "            width: 80px;\n" +
                    "            height: 80px;\n" +
                    "            border-radius: 50%;\n" +
                    "            margin-right: 15px;\n" +
                    "            object-fit: cover;\n" +
                    "        }\n" +
                    "        footer {\n" +
                    "            text-align: center;\n" +
                    "            padding: 1em 0;\n" +
                    "            background: #333;\n" +
                    "            color: #fff;\n" +
                    "            margin-top: 20px;\n" +
                    "        }\n" +
                    "    </style>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "\n" +
                    "    <header>\n" +
                    "        <h1>About [Your Company/Website Name]</h1>\n" +
                    "    </header>\n" +
                    "\n" +
                    "    <div class=\"container\">\n" +
                    "\n" +
                    "        <section id=\"introduction\">\n" +
                    "            <h2>Our Story \uD83D\uDE80</h2>\n" +
                    "            <p>Welcome to **[Your Company/Website Name]**! We started in **[Year]** with a simple, yet ambitious, mission: **[State your core mission or goal]**. Over the years, we've grown from a small idea into a thriving platform/service dedicated to **[Describe your main area of focus, e.g., providing high-quality educational resources, building innovative software solutions, connecting local artists with buyers]**.</p>\n" +
                    "        </section>\n" +
                    "\n" +
                    "        <section id=\"mission-values\">\n" +
                    "            <h2>Mission & Values ✨</h2>\n" +
                    "            <h3>Our Mission</h3>\n" +
                    "            <p>Our goal is to **[Reiterate your mission in more detail, focusing on the impact you want to make, e.g., empower every student to achieve their full potential, create sustainable and ethical products for a better future]**.</p>\n" +
                    "\n" +
                    "            <h3>Our Core Values</h3>\n" +
                    "            <ul>\n" +
                    "                <li>**Integrity:** We operate with transparency and honesty in all our dealings.</li>\n" +
                    "                <li>**Innovation:** We constantly seek new and better ways to serve our community/customers.</li>\n" +
                    "                <li>**Customer/Community Focus:** The needs of our users are at the heart of every decision we make.</li>\n" +
                    "                <li>**[Another Key Value]**</li>\n" +
                    "            </ul>\n" +
                    "        </section>\n" +
                    "\n" +
                    "        <section id=\"team\">\n" +
                    "            <h2>Meet the Team \uD83E\uDDD1\u200D\uD83D\uDCBB</h2>\n" +
                    "            <p>We're a passionate group of **[e.g., developers, designers, educators, enthusiasts]** committed to excellence.</p>\n" +
                    "\n" +
                    "            <div class=\"team-member\">\n" +
                    "                <img src=\"[Link to Team Member 1 Photo]\" alt=\"[Team Member 1 Name]\">\n" +
                    "                <div>\n" +
                    "                    <strong>[Team Member 1 Name]</strong> - [Role, e.g., Founder & CEO]\n" +
                    "                    <p>Brief Bio: [A short sentence about their background or what they focus on.]</p>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "\n" +
                    "            <div class=\"team-member\">\n" +
                    "                <img src=\"[Link to Team Member 2 Photo]\" alt=\"[Team Member 2 Name]\">\n" +
                    "                <div>\n" +
                    "                    <strong>[Team Member 2 Name]</strong> - [Role, e.g., Lead Developer]\n" +
                    "                    <p>Brief Bio: [A short sentence about their background or what they focus on.]</p>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            </section>\n" +
                    "\n" +
                    "        <section id=\"contact\">\n" +
                    "            <h2>Get In Touch \uD83D\uDCE7</h2>\n" +
                    "            <p>Have questions? We'd love to hear from you!</p>\n" +
                    "            <p>Email us at: **<a href=\"mailto:[Your Email Address]\">[Your Email Address]</a>**</p>\n" +
                    "            <p>Follow us on: **<a href=\"[Link to Social Media]\">[Social Media Platform]</a>**</p>\n" +
                    "        </section>\n" +
                    "\n" +
                    "    </div>\n" +
                    "\n" +
                    "    <footer>\n" +
                    "        <p>&copy; 2025 [Your Company/Website Name]. All rights reserved.</p>\n" +
                    "    </footer>\n" +
                    "\n" +
                    "</body>\n" +
                    "</html>");

            // 6. Close the connection
            clientSocket.close();
        }
    }
}