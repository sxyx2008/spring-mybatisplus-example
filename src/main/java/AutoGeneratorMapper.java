import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.ConfigGenerator;

import java.io.File;


public class AutoGeneratorMapper {


	public static void main( String[] args ) {
		ConfigGenerator cg = getConfigGenerator();

		/* mysql 数据库相关配置 */
		cg.setDbDriverName("com.mysql.jdbc.Driver");
		cg.setDbUser("root");
		cg.setDbPassword("root");
		cg.setDbUrl("jdbc:mysql://127.0.0.1:3306/mybatis?characterEncoding=utf8");

		/*
		 * 表主键 ID 生成类型, 自增该设置无效。
		 * <p>
		 * IdType.AUTO 			数据库ID自增
		 * IdType.INPUT			用户输入ID
		 * IdType.ID_WORKER		全局唯一ID，内容为空自动填充（默认配置）
		 * IdType.UUID			全局唯一ID，内容为空自动填充（默认配置）
		 * </p>
		 */
		cg.setIdType(IdType.AUTO);
		
		/*
		 * 指定生成表名（默认，所有表）
		 */
		//cg.setTableNames(new String[]{"user"});

		AutoGenerator.run(cg);

	}


	protected static ConfigGenerator getConfigGenerator() {
		ConfigGenerator cg = new ConfigGenerator();
		cg.setEntityPackage("net.aimeizi.entity");//entity 实体包路径
		cg.setMapperPackage("net.aimeizi.mapper");//mapper 映射文件路径
		cg.setServicePackage("net.aimeizi.service");//service 层路径
		cg.setXmlPackage("net.aimeizi.mapper.xml");//xml层路径（可以不写）
		cg.setServiceImplPackage("net.aimeizi.service.impl");//serviceimpl层路径（可以不写）

		/* 此处可以配置 SuperServiceImpl 子类路径，默认如下 */
		//cg.setSuperServiceImpl("com.baomidou.framework.service.impl.SuperServiceImpl");

		/* 此处设置 String 类型数据库ID，默认Long类型 */
		//cg.setConfigIdType(ConfigIdType.STRING);

		String root = System.getProperty("user.dir"); // 获取当前路径
		String path = root + File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator;
		cg.setSaveDir(path);// 生成文件保存位置

		/*
         * 设置数据库字段是否为驼峰命名，驼峰 true 下划线分割 false
		 */
		cg.setColumnHump(false);
        /*
         * 表是否包括前缀
		 * <p>
		 * 例如 mp_user 生成实体类 false 为 MpUser , true 为 User
		 * </p>
		 */
		cg.setDbPrefix(false);
        /*
         * 默认值为true , 是否覆盖当前路径下已有文件
         */
		cg.setFileOverride(true);
		return cg;
	}

}
