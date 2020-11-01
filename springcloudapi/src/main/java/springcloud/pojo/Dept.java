package springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@NoArgsConstructor
@Accessors(chain=true)//链式写法
public class Dept implements Serializable {//实体类必须序列化
   private  Long deptno;//主键
   private String dname;
   //微服务 一个服务对于一个数据库
   private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
