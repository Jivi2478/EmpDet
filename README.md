# EmpDet
* Open the project in STS and Run it.
* Open Postman, 
* For Adding Employee details(POST) add the details in the format below in Body tab, raw format:
 * {
    "name": "Simon",
    "email": "simon@example.com",
    "address": {
        "street": "simons St",
        "city": "Simon Town",
        "state": "MC",
        "zipCode": "60003"
    }

* Send POST request to " http://localhost:8080/api/employees "

* To display specific Employee's details(GET):
* Include id number in the below request: {id}
* Send GET request to " http://localhost:8080/api/employees/{id} "
  
