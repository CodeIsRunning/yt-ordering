package common.constants;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 统一返回
 *
 * @author lxf
 */
@Data
@ApiModel(value = "公共参数",description = "统一返回")
public class ResultCommonV2<T> {

    @ApiModelProperty(value = "状态码",name = "retCode",example = "9000",dataType = "String",position = 1)
    private String retCode;
    @ApiModelProperty(value = "状态描述",name = "retMsg",example = "成功",dataType = "String",position = 2)
    private String retMsg;
    @ApiModelProperty(value = "具体内容",name = "data",position = 3)
    private T data;

    public ResultCommonV2() {
    }

    public ResultCommonV2(String retCode, String retMsg, T data) {
        super();
        this.retCode = retCode;
        this.retMsg = retMsg;
        this.data = data;
    }

    public static ResultCommonV2 successfulResult(Object data) {
        return new ResultCommonV2(Common.SUCCESS_CODE, Common.SUCCESS_MESSAGE, data);
    }
    public static ResultCommonV2 successfulResult(String message, Object data) {
        return new ResultCommonV2(Common.SUCCESS_CODE, message, data);
    }
    public static ResultCommonV2 successfulResult() {
        return new ResultCommonV2(Common.SUCCESS_CODE, Common.SUCCESS_MESSAGE, "");
    }

    public static ResultCommonV2 failResult() {
        return new ResultCommonV2(Common.SYSTEM_ERROR_CODE, Common.SYSTEM_ERROR_MESSAGE, "");
    }

    public static ResultCommonV2 defaultResultCode(String code, String message) {
        return new ResultCommonV2(code, message, "");
    }

    /**
     * 未登录返回结果
     */

    public static ResultCommonV2 unauthorized(String data) {
        return new ResultCommonV2(Common.UNAUTHORIZED_CODE, Common.UNAUTHORIZED_MSG, data);
    }

    /**
     * 未授权返回结果
     */

    public static ResultCommonV2 forbidden(String data) {
        return new ResultCommonV2(Common.FORBIDDEN_CODE, Common.FORBIDDEN_MSG, data);
    }
}
