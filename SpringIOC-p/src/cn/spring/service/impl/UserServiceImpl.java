package cn.spring.service.impl;


import cn.spring.dao.UserDao;
import cn.spring.pojo.User;
import cn.spring.service.UserService;

/**
 * 用户业务类，实现对User功能的业务管理
 */
public class UserServiceImpl implements UserService {

	// 声明接口类型的引用，和具体实现类解耦合
	private UserDao dao;

    //提供set方法，进行值的注入
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public void addNewUser(User user) {
		// 调用用户DAO的方法保存用户信息
		dao.save(user);
    }
}