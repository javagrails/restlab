# restlab
REST api Example Using Grails 3.2.2
<br/> Need to configure database username, password and url according to your database server in application.yml file
<br/> I use MySql server in this project

# Resources URL
<br/>
Controller: city
<br/> |   POST   | /cities                                | Action: save             |
<br/> |   GET    | /cities                                | Action: index            |
<br/> |  DELETE  | /cities/${id}                          | Action: delete           |
<br/> |   PUT    | /cities/${id}                          | Action: update           |
<br/> |   GET    | /cities/${id}                          | Action: show             |

<br/>
<br/>
Controller: location
<br/> |   POST   | /cities/${cityId}/locations            | Action: save             |
<br/> |   GET    | /cities/${cityId}/locations            | Action: index            |
<br/> |  DELETE  | /cities/${cityId}/locations/${id}      | Action: delete           |
<br/> |   PUT    | /cities/${cityId}/locations/${id}      | Action: update           |
<br/> |   GET    | /cities/${cityId}/locations/${id}      | Action: show             |

# Sample Domain JSON
City Json
<br/>  {"description": "A North Side District of BD","division": "Dhaka","name": "Jamalpur","population": 300000}

<br/>
Location Json
<br/>  {"lat": 23.7897,"lon": 90.3929,"postalCode": "1212","stateProvince": "Dhaka","streetAddress": "23 Gulshan","streetAddressLine2": "lane 13"}
