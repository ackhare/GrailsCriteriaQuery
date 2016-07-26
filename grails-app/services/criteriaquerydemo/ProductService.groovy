package criteriaquerydemo

class ProductService {

    def getAllProducts() {



     def products=   Product.createCriteria().list{
            and {
            eq('name', 'PC')
           eq('salesPrice', 23.00)
        }



        }
println products

    }
}
