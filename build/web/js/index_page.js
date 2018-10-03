var emp_id;
$(document).ready(function(){
    $("#login-button").click(function(){
        
        var id = $("#employeeID").val();
        emp_id = id;
        var password = $("#password").val();
        var isValid = true;
        if (id == ""){
            alert("Please enter Employee ID");
            isValid = false;
        }

        if (password == ""){
            isValid = false;
            alert("Please enter password");
        }

        var expr_id = /^([0-9]{9})/;
        if (id.match(expr_id) == null){
            isValid = false;
            alert("Please enter valid Employee id");
        }

        if (password.length < 8){
            isValid = false;
            alert("Please enter password with atleast 8 characters");
        }

        var expr_pass1 = /[0-9]/g;

        var number_of_numbers = password.match(expr_pass1);
        
        if (number_of_numbers == null){
            isValid = false;
            alert("The password must contain atleast 2 number");
        }

        if (number_of_numbers.length < 2){
            isValid = false;
            alert("The password must contain atleast 2 number");
        }


        if (isValid){
           
            $.get("http://localhost:8080/ncp/login", 
              {
                 id: id,
                 password: password

              }
            ,function(data, status){
              if (data == 'success'){
                localStorage.setItem("id", id );
                    window.location = 'main_page.jsp';
                    
              }
            });
           

        }


       
        
    });
});

