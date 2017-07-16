package restlab

import grails.transaction.Transactional

@Transactional
class CityService {

    def list(def params, def request) {
        return City.findAll()
    }

    def single(def params, def request) {
        return City.findById(params?.id)
    }

    def save(def params, def request) {
        def cityJson = request.JSON
        def cityInstance = new City(cityJson)

        cityInstance = cityInstance.save()

        return cityInstance
    }

    def update(def params, def request) {
        def cityJson = request.JSON
        def cityInstance = City.get(params?.id)
        cityInstance.properties = cityJson

        cityInstance = cityInstance.merge()

        return cityInstance
    }

    def delete(def params, def request) {
        def cityInstance = City.get(params?.id)
        cityInstance = cityInstance.delete()

        return cityInstance
    }


}
