<%-- 
    Document   : EditBank
    Created on : 3 Oct, 2018, 7:16:41 PM
    Author     : harsha
--%>


   
    <div class="card-body">

    <div class="page-header d-flex justify-content-center">
        <h1>Edit Card Details</h1>      
    </div>
    <h3>Enter Details Here: </h3>

    

    
        <div class="form-group">
          <label for="bank">Bank:</label>
          <input type="text" class="form-control" id="bank">
        </div>
        <div class="form-group">
          <label for="branch">Branch:</label>
          <input type="text" class="form-control" id="branch">
        </div>
        <div class="form-group">
            <label for="accno">Account Number:</label>
            <input type="number" class="form-control" id="accno">
        </div>
        <div class="form-group">
            <label for="scode">Sort Code:</label>
            <input type="number" class="form-control" id="scode">
        </div>
        <div class="form-group form-check">
          <label class="form-check-label">
            <input class="form-check-input" type="checkbox" id="check"> I Agree To Terms And Conditions
          </label>
        </div>
        <button type="submit" class="btn btn-primary" id="submit">Submit</button>
    

    </div>
    <script src="js/editBank.js"></script> 



  
