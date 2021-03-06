/********************************************
 * 文件名称: JDKProxyFactory.java
 * 系统名称: xRiskPlus 市场风险管理系统V5.0
 * 模块名称: 
 * 软件版权: 衡泰软件有限公司
 * 功能说明: 
 * 系统版本: 5.0.0.1
 * 开发人员: an.lv
 * 开发时间: 2019/5/6 22:42
 * 审核人员: 
 * 相关文档: 
 * 修改记录: 
 程序版本		修改日期		修改人员		修改单编号		修改说明
 *********************************************/
package proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JDKProxyFactory{
    public Object getProxyInstance(InvocationHandler proxyTarget)  {
        Object target = null;
        try {
            target = proxyTarget.getClass().getMethod("getTarget").invoke(proxyTarget);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                proxyTarget
                );
    }


}
