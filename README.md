# restlab
REST api Example Using Grails 3.2.2

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
