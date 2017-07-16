# restlab
REST api Example Using Grails 3.2.2

# Resources URL
Controller: city
 |   POST   | /cities                                | Action: save             |
 |   GET    | /cities                                | Action: index            |
 |  DELETE  | /cities/${id}                          | Action: delete           |
 |   PUT    | /cities/${id}                          | Action: update           |
 |   GET    | /cities/${id}                          | Action: show             |

Controller: location
 |   POST   | /cities/${cityId}/locations            | Action: save             |
 |   GET    | /cities/${cityId}/locations            | Action: index            |
 |  DELETE  | /cities/${cityId}/locations/${id}      | Action: delete           |
 |   PUT    | /cities/${cityId}/locations/${id}      | Action: update           |
 |   GET    | /cities/${cityId}/locations/${id}      | Action: show             |
