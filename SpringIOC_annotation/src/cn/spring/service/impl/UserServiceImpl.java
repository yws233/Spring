package cn.spring.service.impl;


import cn.spring.dao.UserDao;
import cn.spring.pojo.User;
import cn.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户业务类，实现对User功能的业务管理
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	/*// 1.对注解进行装配
    @Autowired
    @Qualifier("userDao") //指定bean的名称*/

	//@Resource(name = "userDao") //使用Resource进行注解,不标注name，则会以此按照属性名、类名进行查找
	private UserDao dao;
    @Resource(name = "userDao")//也可装配到set方法前
    public void setDao(@Qualifier("userDao") UserDao dao) {
        this.dao = dao;
    }

    /*public void setDao(@Qualifier("userDao") UserDao dao) {
        this.dao = dao;
    }*/
   /* //2.也可在构造器进行注入
    public UserServiceImpl() {
    }
    @Autowired
    public UserServiceImpl(@Qualifier("userDao") UserDao dao){
        this.dao = dao;
    }*/
    public void addNewUser(User user) {
		// 调用用户DAO的方法保存用户信息
		dao.save(user);
    }
}