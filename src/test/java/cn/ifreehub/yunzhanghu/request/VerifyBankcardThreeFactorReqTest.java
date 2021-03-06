package cn.ifreehub.yunzhanghu.request;

import org.junit.Test;

import cn.ifreehub.yunzhanghu.DefaultYunzhanghuClient;
import cn.ifreehub.yunzhanghu.YunzhanghuClient;
import cn.ifreehub.yunzhanghu.common.WebUtils;
import cn.ifreehub.yunzhanghu.response.VerifyBankcardThreeFactorResp;

public class VerifyBankcardThreeFactorReqTest {

  /**
   * 初始化调用者
   */
  private YunzhanghuClient client =
      new DefaultYunzhanghuClient("0123456", "sha256",
          "78f9b4fad3481fbce1df0b30eee58577", "123456788765432112345678", new WebUtils());

  @Test
  public void test() {
    // 构造银行卡三要素验证命令
    VerifyBankcardThreeFactorReq req = new VerifyBankcardThreeFactorReq();
    req.setCardNo("");
    req.setIdCard("");
    req.setRealName("");

    // 发送命令,并拿到返回值
    VerifyBankcardThreeFactorResp resp = client.execute(req);

    System.out.println(resp);
  }

}