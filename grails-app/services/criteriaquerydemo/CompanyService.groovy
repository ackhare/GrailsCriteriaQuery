package criteriaquerydemo

class CompanyService {

    def getAllCompany() {

        def companies
//        pagination demo
        companies = Company.createCriteria().list(max: 5, offset: 0) {

//            ne('name','infosys')
        }
//        println companies

        //And or demo
//
//        companies=Company.createCriteria().list{
//
//            or {
//                and {
//                    eq('name', 'nike')
//
//                }
//                and {
//                    eq('name', 'infosys')
//
//                }
//            }
//        }

        //order demo
        companies = Company.createCriteria().list {
            order('name', 'asc')
            firstResult(1)
            maxResults(5)
        }
//      println companies


        println companies



        println companies


        return companies

    }

    def projectionsDemo() {

        List companies = []
        companies = Company.createCriteria().list {
            projections {
                property('name')
                property('location')
            }
        }
        return companies


    }


}
