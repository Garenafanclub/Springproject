package org.ReviseSpring.coding;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.ReviseSpring.Classes")
public class AppConfig {



//    @Bean
//    public Alien alien(@Qualifier("laptop") @Autowired  Computer computer)   // NOW ALIEN IS DEPENDENT ON COMPUTER OBJECT...
//    {
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setComputer(computer);
//       // obj.setComputer(laptop());   // Tight COUPLING...
//        return obj;
//    }
//
////    @Bean({"com","beast","laptop1"})
//    @Bean
//     // @Primary
//   // @Scope("prototype")
//    public Laptop laptop()
//    {
//        return new Laptop();
//    }
//
//    @Bean
//    //@Lazy
//      // @Primary  IT IS USED WHEN THERE IS CONFUSING WHICH ONE TO CHOOSE...
//    public Desktop desktop()
//    {
//        return new Desktop();
//    }
}
