package restlab

class City {
    Long   id
    String name
    String division
    String description
    Long   population

    static hasMany = [locations: Location]

    static constraints = {
        division nullable: true
        description nullable: true
        population nullable: true
        locations nullable: true
    }

    static mapping = {
        version false
    }
}


// grails create-service restlab.City
// grails create-restful-controller restlab.City

