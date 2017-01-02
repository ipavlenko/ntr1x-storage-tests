package com.ntr1x.storage.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ntr1x.storage.app.App;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class, webEnvironment = WebEnvironment.RANDOM_PORT)
@TestPropertySource({
	"classpath:application.properties",
	"classpath:application-test.properties"
})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserResourceTest {
    
    @LocalServerPort
    private int port;
    
//    private WebTarget target;
//  
//    @Before
//    public void init() {
//      
//        target = ClientBuilder
//
//            .newClient()
//            .target(String.format("http://localhost:%d", this.port))
//        ;
//    }
    
    @Test
    public void test() {
    }
    
//    @Test
//    public void test() {
//    
//        User[] users = { null };
//        
//        profiler.withDisabledSecurity(() -> {
//            
//            IUserService.CreateUser s = new IUserService.CreateUser(); {
//                
//            	s.origin = "local";
//                s.confirmed = true;
//                s.email = "admin@example.com";
//                s.identity = "";
//                s.password = "admin";
//                s.phone = "00000000000";
//                s.name = "admin";
//                s.confirmed = true;
//            }
//            
//            User r = target
//              .path("/users")
//              .request(MediaType.APPLICATION_JSON_TYPE)
//              .post(Entity.entity(s, MediaType.APPLICATION_JSON_TYPE), User.class)
//            ;
//            
//            Assert.assertNotNull(r.getId());
//            Assert.assertEquals(s.email, r.getEmail());
//            Assert.assertNull(r.getPwdhash());
//            Assert.assertNull(r.getRandom());
//            
//            users[0] = r;
//        });
//
//        profiler.withDisabledSecurity(() -> {
//            
//            {
//                User r = target
//                    .path(String.format("/users/i/%d", users[0].getId()))
//                    .request()
//                    .get(User.class)
//                ;
//                  
//                Assert.assertEquals(users[0].getId(), r.getId());
//                Assert.assertNull(r.getPwdhash());
//                Assert.assertNull(r.getRandom());
//            }
//        });
//        
//        profiler.withDisabledSecurity(() -> {
//        
//            {
//                IUserService.UsersResponse r = target
//                    .path("/users")
//                    .queryParam("page", 0)
//                    .queryParam("size", 10)
//                    .request()
//                    .get(IUserService.UsersResponse.class)
//                ;
//                  
//                Assert.assertEquals(1, r.count);
//                Assert.assertEquals(10, r.size);
//                Assert.assertEquals(0, r.page, 0);
//                Assert.assertEquals(1, r.users.size());
//            }
//            
//            {
//                IUserService.UsersResponse r = target
//                    .path("/users")
//                    .queryParam("page", 0)
//                    .queryParam("size", 10)
//                    .request()
//                    .get(IUserService.UsersResponse.class)
//                ;
//                  
//                Assert.assertEquals(1, r.count);
//                Assert.assertEquals(10, r.size);
//                Assert.assertEquals(0, r.page, 0);
//                Assert.assertEquals(1, r.users.size());
//            }
//        });
//        
//        profiler.withDisabledSecurity(() -> {
//            
//            {
//                User r = target
//                    .path(String.format("/users/i/%d", users[0].getId()))
//                    .queryParam("page", 0)
//                    .request()
//                    .delete(User.class)
//                ;
//                  
//                Assert.assertEquals(users[0].getId(), r.getId());
//                Assert.assertNull(r.getPwdhash());
//                Assert.assertNull(r.getRandom());
//            }
//        });
//    }
}
