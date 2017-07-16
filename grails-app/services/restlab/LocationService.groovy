package restlab

import grails.transaction.Transactional

@Transactional
class LocationService {

    def list(def params, def request) {
        def cityId = params.cityId
        return Location.where { city.id == cityId }.list()
    }

    def single(def params, def request) {
        def cityId = params.cityId
        def locationId = params?.id

        def criteria = Location.createCriteria()
        def result = criteria.get{
            and {
                eq ('city.id', Long.parseLong(cityId))
                eq ('id', Long.parseLong(locationId))
            }
        }
        return result

    }

    def save(def params, def request) {
        def cityId = params.cityId
        def city = City.get(cityId)

        def locationJson = request.JSON
        def locationInstance = new Location(locationJson)

        //locationInstance = locationInstance.save()
        city.addToLocations(locationInstance)

        return locationInstance
    }

    def update(def params, def request) {
        def locationId = params?.id
        def locationJson = request.JSON

        def locationInstance = Location.get(locationId)
        locationInstance.properties = locationJson

        locationInstance = locationInstance.merge()

        return locationInstance

    }

    def delete(def params, def request) {
        def locationId = params?.id

        def locationInstance = Location.get(locationId)

        locationInstance = locationInstance.delete()

        return locationInstance
    }



}
