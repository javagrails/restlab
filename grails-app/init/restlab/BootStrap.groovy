package restlab

class BootStrap {

    def init = { servletContext ->

        if(City.count() < 1){
            def city1 = new City(name: 'Dhaka', division: 'Dhaka', description: 'Capital of BD', population: 15000000)
            def city2 = new City(name: 'Tangail', division: 'Dhaka', description: 'A District of BD', population: 500000)

            def loc1 = new Location(streetAddress: '23 Gulshan', streetAddressLine2: 'lane 13', postalCode: '1212', stateProvince: 'Dhaka', lat: 23.789707, lon: 90.392924)
            def loc2 = new Location(streetAddress: '12 Badda', streetAddressLine2: 'lane 11', postalCode: '1212', stateProvince: 'Dhaka', lat: 23.778280, lon: 90.424983)
            def loc3 = new Location(streetAddress: '100 Uttara', streetAddressLine2: 'lane 21', postalCode: '1229', stateProvince: 'Dhaka', lat: 23.863396, lon: 90.398361)

            def loc4 = new Location(streetAddress: '23 Dhanbari', streetAddressLine2: 'lane 31', postalCode: '1997', stateProvince: 'Tangail', lat: 24.680874, lon: 89.960024)
            def loc5 = new Location(streetAddress: '100 Madupur', streetAddressLine2: 'lane 12', postalCode: '1990', stateProvince: 'Tangail', lat: 24.605670, lon: 90.032121)

            def d1 = city1.addToLocations(loc1).save()
            def d2 = city1.addToLocations(loc2).save()
            def d3 = city1.addToLocations(loc3).save()
            def d4 = city2.addToLocations(loc4).save()
            def d5 = city2.addToLocations(loc5).save()

            /*println(d1)
            println(d2)
            println(d3)
            println(d4)
            println(d5)*/
        }
    }
    def destroy = {
    }
}
