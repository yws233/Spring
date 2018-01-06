package cn.aop.service.impl;


import cn.aop.dao.UserDao;
import cn.aop.pojo.User;
import cn.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务类，实现对User功能的业务管理
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	// 声明接口类型的引用，和具体实现类解耦合
    @Autowired
	private UserDao dao;

	public void addNewUser(User user) {
		// 调用用户DAO的方法保存用户信息
		dao.save(user);
	}
}