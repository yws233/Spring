package cn.spring.dao.impl;

import cn.spring.dao.UserDao;
import cn.spring.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * 用户DAO类，实现I Dao接口，负责User类的持久化操作
 */
@Repository("userDao") //数据访问层注解，起名称"userdao"
public class UserDaoImpl implements UserDao {

	public void save(User user) {
		// 这里并未实现完整的数据库操作，仅为说明问题
		System.out.println("保存用户信息到数据库!");
	}
}