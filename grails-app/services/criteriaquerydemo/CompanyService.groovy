package criteriaquerydemo

class CompanyService {

    def getAllCompany() {

        List companies=[]
        //pagination
        //companies=Company.createCriteria().list(max:5,offset: 0){}
        //println companies

        //And or
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
//
//
//
//
        companies=Company.createCriteria().list {
            order('name', 'asc')
            firstResult(1)
            maxResults(5)
        }



        return companies

    }
}
