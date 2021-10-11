package config;

import dao.IAppointmentDao;
import dao.IDoctorDao;
import dao.IUserDao;
import dao.fake.AppointmentDao;
import dao.fake.DoctorDao;
import dao.fake.UserDao;
import dao.impl.RealUserDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import services.*;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
//    @Scope("prototype")
    public IUserDao userDao() {
        return new RealUserDaoImpl();
    }

    @Bean
    public IUserDao userDaoFake() {
        return new UserDao();
    }

    @Bean
    public IDoctorDao doctorDao() {
        return new DoctorDao();
    }
    @Bean
    public IAppointmentDao appointmentDao() {
        return new AppointmentDao();
    }
//    @Bean
//    public IUserService userService() {
//        return new UserService(userDao());
//    }
    @Bean
    public IDoctorService doctorService() {
        return new DoctorService();
    }
    @Bean
    public IAppointmentService appointmentRepository() {
        return new AppointmentService();
    }
}
