package club.zqg.prision.util;

import java.util.HashMap;
import java.util.Map;

public class Msg {

    // 状态码
    private Integer code;
    // 提示信息
    private String msg;
    // 用户返回给浏览器的数据给map
    private Map<String, Object> extend = new HashMap<String, Object>();

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    // 添加相关信息
    public Msg add(String key, Object value) {
        this.getExtend().put(key, value);
        return this; // 返回处理Msg对象
    }

    // 处理成功 返回对象
    public static Msg success(String message) {
        Msg msg = new Msg();
        msg.setCode(200);
        msg.setMsg(message);
        return msg;
    }

    //处理失败 返回对象
    public static Msg fail(String message) {
        Msg msg = new Msg();
        msg.setCode(500);
        msg.setMsg(message);
        return msg;
    }
}