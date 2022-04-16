<%-- 
    Document   : firstpage
    Created on : Jul 9, 2021, 1:07:54 PM
    Author     : USER
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>First Page</title>
        <link rel="stylesheet" href="css/style.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>

 html {
                height: 100%;
                width: 100%;
                background-position: center;
                background-size: cover;
                background-color: #e6f2ff;
        }
            body {
                height: 100%;
                font-family: Arial, Helvetica, sans-serif;
}

.button {
    background-color: powderblue; 
    border: none;
    color: black;
    padding: 15px 32px;
    font-size: 16px;
    cursor: pointer;
    border-radius: 12px;
    width: 190px;
    margin-left: 30px;
    margin-bottom: 30px;
}
.button:hover {
    border: 4px solid rgb(64, 64, 145);
    width: 190px;
}

h1{
   text-align: center;
   color: teal;
   font-family: merriweather;
   position: relative;
   bottom:-30px;
   
}
.container {
    position:absolute;
    right: 0;
    margin-top: 20px;
    margin-right: 37%;
    margin-bottom: 20px;
    width: 250px;
    padding: 30px;
    height: 280px;
}

.icon {
    height:20px;
}
h2{
    margin-top: 5px;
    text-align: center;
    color: black;
}

        </style>
    </head>

    <body>
        <h1>LEAVE APPLICATION SYSTEM</h1><br>
        <h2>LOGIN&ensp;FOR&ensp;STAFF</h2>
        <div class="bg-img">
            <div class="container">
                
                <button class="button" onclick="myFunction()">&nbspEMPLOYEE</button>
                <button class="button" onclick="myFunction2()">&nbspSUPERVISOR</button>
                <button class="button" onclick="myFunction3()">&nbspADMIN</button>
                
            </div>
            <script>

                function myFunction() {
                    window.location.href = "loginemployee.jsp";
                }

                function myFunction2() {
                    window.location.href = "loginsupervisor.jsp";
                }
                
                function myFunction3() {
                    window.location.href = "loginadmin.jsp";
                }

            </script>
        </div>
    </body>
</html>