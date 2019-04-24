import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MBG {
    @Test
    public void mbg() throws Exception {
        //MBG执行过程中的警告信息
        List<String> warnings = new ArrayList<>();
        //当生成代码重复时，覆盖原代码
        boolean overwrite = true;
        //读取MBG配置文件
        File configFile = new File("C:\\Users\\Administrator.SC-201904071224\\IdeaProjects\\prision_project\\src\\main\\resources\\mbg.xml");

        // ...根据需要填写配置对象......
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);

        // 创建MBG
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);

        // 执行生成代码
        myBatisGenerator.generate(null);
    }
}
