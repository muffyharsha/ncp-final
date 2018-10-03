<%-- 
    Document   : main_page
    Created on : 3 Oct, 2018, 7:06:50 PM
    Author     : harsha
--%>


<!DOCTYPE html>
<html>

<head>

     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
     <link rel="stylesheet" href="css/main_page.css">
     <link href="https://fonts.googleapis.com/css?family=Glegoo:700" rel="stylesheet"> 
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
     <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
     <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
     
</head>


<body>
        
        <div class="wrapper">
                <!-- Sidebar -->
                <nav id="sidebar">
                    <div class="sidebar-header">
                        <h3>Payroll management</h3>
                    </div>
            
                    <ul class="list-unstyled components">
                        <p><span><i class="fa fa-address-book"><span id = "username">Hello</span></i></span> </p>
                        <li class="active">
                            <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Employee Leave</a>
                            <ul class="collapse list-unstyled" id="homeSubmenu">
                                <li>
                                    <a id="Apply_leave" href="Apply_leave.jsp">Apply Leave</a>
                                </li>
                                <li>
                                    <a id="Leave_history"  href="Leave_history.jsp">Leave History</a>
                                </li>
                               
                            </ul>
                        </li>
                        <li>
                            <a id="personaldetails_nav" href="personaldetails_page.jsp">Personal Information</a>
                        </li>
                        <li>
                            <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Employee Finance Information</a>
                            <ul class="collapse list-unstyled" id="pageSubmenu">
                                <li>
                                    <a id = "aeditbank" href="EditBank.jsp">Edit Bank Details</a>
                                </li>
                                <li>
                                    <a id = "aaddbank" href="EditBank.jsp">Add Bank Account</a>
                                </li>
                                <li>
                                    <a id = "aviewbank" href="ViewBank.jsp">View Bank Account</a>
                                </li>
                                <li>
                                    <a href="#">Paycheck History</a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a id = "workdetails_nav" href="workdetails_page.jsp">Work Details</a>
                        </li>
                       
                        <li>
                            <a id = "signout" >Logout</a>
                        </li>
                    </ul>
            
                </nav>
               <div class = "container-fluid" id = "cont">

                </div>
            </div>      

        <script src="js/main_page.js"></script>    

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        
    
        
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
</body>


</html>