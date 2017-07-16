package restlab


import grails.rest.*
import grails.converters.*

class CityController extends RestfulController {
    def cityService
    static responseFormats = ['json', 'xml']
    CityController() {
        super(City)
    }

    @Override
    def index() {
        respond cityService.list(params,request)
    }

    @Override
    def show() {
        respond cityService.single(params,request)
    }

    @Override
    def save() {
        def city = cityService.save(params,request)
        respond city
    }

    @Override
    def update() {
        def city = cityService.update(params,request)
        respond city
    }

    @Override
    def delete() {
        def city = cityService.delete(params,request)
        respond city
    }



}
