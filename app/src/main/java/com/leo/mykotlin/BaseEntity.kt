package com.leo.mykotlin

/**
 * Author WengLei
 * Email wenglei@wxqkxx.cn
 * Create at - 2019/8/1 0001
 * Description:
 */
class BaseEntity {

    /**
     * message : 历史客户查找成功
     * listOrderInfoBean : [{"createTime":"2019-08-01T03:25:35Z[UTC]","detailContent":"同意","lenderId":1481,"lenderInfoBean":{"idCard":"321283198706043672","lenderId":1481,"lenderName":"翁磊","telephone":"19805124024"},"orderId":1681,"orderStatus":"13","preloanId":266,"preloanInfoBean":{"ckVersion":"02","preloanId":266,"preloanName":"完整版产品"},"tradeStatus":"00"},{"createTime":"2019-08-01T02:57:49Z[UTC]","detailContent":"同意","lenderId":1461,"lenderInfoBean":{"idCard":"321283198706043672","lenderId":1461,"lenderName":"翁磊","telephone":"19805124024"},"orderId":1661,"orderStatus":"13","preloanId":266,"preloanInfoBean":{"ckVersion":"02","preloanId":266,"preloanName":"完整版产品"},"tradeStatus":"00"}]
     * recode : 0
     */

    var message: String? = null
    var recode: String? = null
    var listOrderInfoBean: List<ListOrderInfoBeanBean>? = null

    class ListOrderInfoBeanBean {
        /**
         * createTime : 2019-08-01T03:25:35Z[UTC]
         * detailContent : 同意
         * lenderId : 1481
         * lenderInfoBean : {"idCard":"321283198706043672","lenderId":1481,"lenderName":"翁磊","telephone":"19805124024"}
         * orderId : 1681
         * orderStatus : 13
         * preloanId : 266
         * preloanInfoBean : {"ckVersion":"02","preloanId":266,"preloanName":"完整版产品"}
         * tradeStatus : 00
         */

        var createTime: String? = null
        var detailContent: String? = null
        var lenderId: Int = 0
        var lenderInfoBean: LenderInfoBeanBean? = null
        var orderId: Int = 0
        var orderStatus: String? = null
        var preloanId: Int = 0
        var preloanInfoBean: PreloanInfoBeanBean? = null
        var tradeStatus: String? = null

        class LenderInfoBeanBean {
            /**
             * idCard : 321283198706043672
             * lenderId : 1481
             * lenderName : 翁磊
             * telephone : 19805124024
             */

            var idCard: String? = null
            var lenderId: Int = 0
            var lenderName: String? = null
            var telephone: String? = null
        }

        class PreloanInfoBeanBean {
            /**
             * ckVersion : 02
             * preloanId : 266
             * preloanName : 完整版产品
             */

            var ckVersion: String? = null
            var preloanId: Int = 0
            var preloanName: String? = null
        }
    }
}
