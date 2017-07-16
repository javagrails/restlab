# restlab
REST api Example Using Grails 3.2.2
<br/> Need to configure database username, password and url according to your database server in application.yml file
<br/> I use MySql server in this project

# Resources URL
#### <i class="icon-file"></i> Controller: city

| Http Method | Resource URL | Rest Controller Action |
| ------- | ------- | ------- |
| GET | http://localhost:8080/cities | Action: index |
| GET | http://localhost:8080/cities/${id} | Action: show |
| POST | http://localhost:8080/cities | Action: save |
| PUT | http://localhost:8080/cities/${id} | Action: update |
| DELETE | http://localhost:8080/cities/${id} | Action: delete |

#### <i class="icon-file"></i> Controller: location 

| Http Method | Resource URL | Rest Controller Action |
| ------- | ------- | ------- |
| GET | http://localhost:8080/cities/${cityId}/locations | Action: index |
| GET | http://localhost:8080/cities/${cityId}/locations/${id} | Action: show |
| POST | http://localhost:8080/cities/${cityId}/locations | Action: save |
| PUT | http://localhost:8080/cities/${cityId}/locations/${id}  | Action: update |
| DELETE | http://localhost:8080/cities/${cityId}/locations/${id}  | Action: delete |


# Sample Domain JSON
City Json
<br/>  {"description": "A North Side District of BD","division": "Dhaka","name": "Jamalpur","population": 300000}

<br/>
Location Json
<br/>  {"lat": 23.7897,"lon": 90.3929,"postalCode": "1212","stateProvince": "Dhaka","streetAddress": "23 Gulshan","streetAddressLine2": "lane 13"}
