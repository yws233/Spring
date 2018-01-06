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
    private String str1;
    private String str2;
    private int num;

    /*
    * 验证构造器注入与参数顺序无关
    * */
    public UserServiceImpl(UserDao dao, String str1) {
        this.dao = dao;
        this.str1 = str1;
    }
    public UserServiceImpl(String str2,UserDao dao) {
        this.dao = dao;
        this.str2 = str2;
    }

    //验证属性类型注入
    public UserServiceImpl(int num,UserDao dao) {
        this.dao = dao;
        this.num = num;
    }

    // 构造器
    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }
    public UserServiceImpl(){}

    public void addNewUser(User user) {
		// 调用用户DAO的方法保存用户信息
		dao.save(user);
        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);
        System.out.println("num:" + num);
    }
}