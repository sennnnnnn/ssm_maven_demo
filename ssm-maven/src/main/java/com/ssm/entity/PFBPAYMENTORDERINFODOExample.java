package com.ssm.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PFBPAYMENTORDERINFODOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PFBPAYMENTORDERINFODOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCodeIsNull() {
            addCriterion("PAYMENT_ORDER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCodeIsNotNull() {
            addCriterion("PAYMENT_ORDER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCodeEqualTo(String value) {
            addCriterion("PAYMENT_ORDER_CODE =", value, "paymentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCodeNotEqualTo(String value) {
            addCriterion("PAYMENT_ORDER_CODE <>", value, "paymentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCodeGreaterThan(String value) {
            addCriterion("PAYMENT_ORDER_CODE >", value, "paymentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_ORDER_CODE >=", value, "paymentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCodeLessThan(String value) {
            addCriterion("PAYMENT_ORDER_CODE <", value, "paymentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_ORDER_CODE <=", value, "paymentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCodeLike(String value) {
            addCriterion("PAYMENT_ORDER_CODE like", value, "paymentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCodeNotLike(String value) {
            addCriterion("PAYMENT_ORDER_CODE not like", value, "paymentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCodeIn(List<String> values) {
            addCriterion("PAYMENT_ORDER_CODE in", values, "paymentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCodeNotIn(List<String> values) {
            addCriterion("PAYMENT_ORDER_CODE not in", values, "paymentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCodeBetween(String value1, String value2) {
            addCriterion("PAYMENT_ORDER_CODE between", value1, value2, "paymentOrderCode");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderCodeNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_ORDER_CODE not between", value1, value2, "paymentOrderCode");
            return (Criteria) this;
        }

        public Criteria andBillOrderDataIdIsNull() {
            addCriterion("BILL_ORDER_DATA_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillOrderDataIdIsNotNull() {
            addCriterion("BILL_ORDER_DATA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillOrderDataIdEqualTo(String value) {
            addCriterion("BILL_ORDER_DATA_ID =", value, "billOrderDataId");
            return (Criteria) this;
        }

        public Criteria andBillOrderDataIdNotEqualTo(String value) {
            addCriterion("BILL_ORDER_DATA_ID <>", value, "billOrderDataId");
            return (Criteria) this;
        }

        public Criteria andBillOrderDataIdGreaterThan(String value) {
            addCriterion("BILL_ORDER_DATA_ID >", value, "billOrderDataId");
            return (Criteria) this;
        }

        public Criteria andBillOrderDataIdGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_ORDER_DATA_ID >=", value, "billOrderDataId");
            return (Criteria) this;
        }

        public Criteria andBillOrderDataIdLessThan(String value) {
            addCriterion("BILL_ORDER_DATA_ID <", value, "billOrderDataId");
            return (Criteria) this;
        }

        public Criteria andBillOrderDataIdLessThanOrEqualTo(String value) {
            addCriterion("BILL_ORDER_DATA_ID <=", value, "billOrderDataId");
            return (Criteria) this;
        }

        public Criteria andBillOrderDataIdLike(String value) {
            addCriterion("BILL_ORDER_DATA_ID like", value, "billOrderDataId");
            return (Criteria) this;
        }

        public Criteria andBillOrderDataIdNotLike(String value) {
            addCriterion("BILL_ORDER_DATA_ID not like", value, "billOrderDataId");
            return (Criteria) this;
        }

        public Criteria andBillOrderDataIdIn(List<String> values) {
            addCriterion("BILL_ORDER_DATA_ID in", values, "billOrderDataId");
            return (Criteria) this;
        }

        public Criteria andBillOrderDataIdNotIn(List<String> values) {
            addCriterion("BILL_ORDER_DATA_ID not in", values, "billOrderDataId");
            return (Criteria) this;
        }

        public Criteria andBillOrderDataIdBetween(String value1, String value2) {
            addCriterion("BILL_ORDER_DATA_ID between", value1, value2, "billOrderDataId");
            return (Criteria) this;
        }

        public Criteria andBillOrderDataIdNotBetween(String value1, String value2) {
            addCriterion("BILL_ORDER_DATA_ID not between", value1, value2, "billOrderDataId");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNull() {
            addCriterion("CHANNEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNotNull() {
            addCriterion("CHANNEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeEqualTo(String value) {
            addCriterion("CHANNEL_CODE =", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotEqualTo(String value) {
            addCriterion("CHANNEL_CODE <>", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThan(String value) {
            addCriterion("CHANNEL_CODE >", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CODE >=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThan(String value) {
            addCriterion("CHANNEL_CODE <", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CODE <=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLike(String value) {
            addCriterion("CHANNEL_CODE like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotLike(String value) {
            addCriterion("CHANNEL_CODE not like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIn(List<String> values) {
            addCriterion("CHANNEL_CODE in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotIn(List<String> values) {
            addCriterion("CHANNEL_CODE not in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeBetween(String value1, String value2) {
            addCriterion("CHANNEL_CODE between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_CODE not between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNull() {
            addCriterion("ITEM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNotNull() {
            addCriterion("ITEM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andItemCodeEqualTo(String value) {
            addCriterion("ITEM_CODE =", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotEqualTo(String value) {
            addCriterion("ITEM_CODE <>", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThan(String value) {
            addCriterion("ITEM_CODE >", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_CODE >=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThan(String value) {
            addCriterion("ITEM_CODE <", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThanOrEqualTo(String value) {
            addCriterion("ITEM_CODE <=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLike(String value) {
            addCriterion("ITEM_CODE like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotLike(String value) {
            addCriterion("ITEM_CODE not like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeIn(List<String> values) {
            addCriterion("ITEM_CODE in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotIn(List<String> values) {
            addCriterion("ITEM_CODE not in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeBetween(String value1, String value2) {
            addCriterion("ITEM_CODE between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotBetween(String value1, String value2) {
            addCriterion("ITEM_CODE not between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("ORDER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("ORDER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("ORDER_AMOUNT >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("ORDER_AMOUNT in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_AMOUNT not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_AMOUNT between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_AMOUNT not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIsNull() {
            addCriterion("FEE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIsNotNull() {
            addCriterion("FEE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFeeAmountEqualTo(BigDecimal value) {
            addCriterion("FEE_AMOUNT =", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotEqualTo(BigDecimal value) {
            addCriterion("FEE_AMOUNT <>", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThan(BigDecimal value) {
            addCriterion("FEE_AMOUNT >", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_AMOUNT >=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThan(BigDecimal value) {
            addCriterion("FEE_AMOUNT <", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_AMOUNT <=", value, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountIn(List<BigDecimal> values) {
            addCriterion("FEE_AMOUNT in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotIn(List<BigDecimal> values) {
            addCriterion("FEE_AMOUNT not in", values, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_AMOUNT between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andFeeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_AMOUNT not between", value1, value2, "feeAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelIsNull() {
            addCriterion("PAYMENT_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelIsNotNull() {
            addCriterion("PAYMENT_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelEqualTo(String value) {
            addCriterion("PAYMENT_CHANNEL =", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotEqualTo(String value) {
            addCriterion("PAYMENT_CHANNEL <>", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelGreaterThan(String value) {
            addCriterion("PAYMENT_CHANNEL >", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_CHANNEL >=", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelLessThan(String value) {
            addCriterion("PAYMENT_CHANNEL <", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_CHANNEL <=", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelLike(String value) {
            addCriterion("PAYMENT_CHANNEL like", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotLike(String value) {
            addCriterion("PAYMENT_CHANNEL not like", value, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelIn(List<String> values) {
            addCriterion("PAYMENT_CHANNEL in", values, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotIn(List<String> values) {
            addCriterion("PAYMENT_CHANNEL not in", values, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelBetween(String value1, String value2) {
            addCriterion("PAYMENT_CHANNEL between", value1, value2, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_CHANNEL not between", value1, value2, "paymentChannel");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelCodeIsNull() {
            addCriterion("PAYMENT_CHANNEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelCodeIsNotNull() {
            addCriterion("PAYMENT_CHANNEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelCodeEqualTo(String value) {
            addCriterion("PAYMENT_CHANNEL_CODE =", value, "paymentChannelCode");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelCodeNotEqualTo(String value) {
            addCriterion("PAYMENT_CHANNEL_CODE <>", value, "paymentChannelCode");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelCodeGreaterThan(String value) {
            addCriterion("PAYMENT_CHANNEL_CODE >", value, "paymentChannelCode");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_CHANNEL_CODE >=", value, "paymentChannelCode");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelCodeLessThan(String value) {
            addCriterion("PAYMENT_CHANNEL_CODE <", value, "paymentChannelCode");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_CHANNEL_CODE <=", value, "paymentChannelCode");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelCodeLike(String value) {
            addCriterion("PAYMENT_CHANNEL_CODE like", value, "paymentChannelCode");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelCodeNotLike(String value) {
            addCriterion("PAYMENT_CHANNEL_CODE not like", value, "paymentChannelCode");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelCodeIn(List<String> values) {
            addCriterion("PAYMENT_CHANNEL_CODE in", values, "paymentChannelCode");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelCodeNotIn(List<String> values) {
            addCriterion("PAYMENT_CHANNEL_CODE not in", values, "paymentChannelCode");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelCodeBetween(String value1, String value2) {
            addCriterion("PAYMENT_CHANNEL_CODE between", value1, value2, "paymentChannelCode");
            return (Criteria) this;
        }

        public Criteria andPaymentChannelCodeNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_CHANNEL_CODE not between", value1, value2, "paymentChannelCode");
            return (Criteria) this;
        }

        public Criteria andPayChannelOrderIsNull() {
            addCriterion("PAY_CHANNEL_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelOrderIsNotNull() {
            addCriterion("PAY_CHANNEL_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelOrderEqualTo(String value) {
            addCriterion("PAY_CHANNEL_ORDER =", value, "payChannelOrder");
            return (Criteria) this;
        }

        public Criteria andPayChannelOrderNotEqualTo(String value) {
            addCriterion("PAY_CHANNEL_ORDER <>", value, "payChannelOrder");
            return (Criteria) this;
        }

        public Criteria andPayChannelOrderGreaterThan(String value) {
            addCriterion("PAY_CHANNEL_ORDER >", value, "payChannelOrder");
            return (Criteria) this;
        }

        public Criteria andPayChannelOrderGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_CHANNEL_ORDER >=", value, "payChannelOrder");
            return (Criteria) this;
        }

        public Criteria andPayChannelOrderLessThan(String value) {
            addCriterion("PAY_CHANNEL_ORDER <", value, "payChannelOrder");
            return (Criteria) this;
        }

        public Criteria andPayChannelOrderLessThanOrEqualTo(String value) {
            addCriterion("PAY_CHANNEL_ORDER <=", value, "payChannelOrder");
            return (Criteria) this;
        }

        public Criteria andPayChannelOrderLike(String value) {
            addCriterion("PAY_CHANNEL_ORDER like", value, "payChannelOrder");
            return (Criteria) this;
        }

        public Criteria andPayChannelOrderNotLike(String value) {
            addCriterion("PAY_CHANNEL_ORDER not like", value, "payChannelOrder");
            return (Criteria) this;
        }

        public Criteria andPayChannelOrderIn(List<String> values) {
            addCriterion("PAY_CHANNEL_ORDER in", values, "payChannelOrder");
            return (Criteria) this;
        }

        public Criteria andPayChannelOrderNotIn(List<String> values) {
            addCriterion("PAY_CHANNEL_ORDER not in", values, "payChannelOrder");
            return (Criteria) this;
        }

        public Criteria andPayChannelOrderBetween(String value1, String value2) {
            addCriterion("PAY_CHANNEL_ORDER between", value1, value2, "payChannelOrder");
            return (Criteria) this;
        }

        public Criteria andPayChannelOrderNotBetween(String value1, String value2) {
            addCriterion("PAY_CHANNEL_ORDER not between", value1, value2, "payChannelOrder");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("ORDER_STATUS =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("ORDER_STATUS <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("ORDER_STATUS >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("ORDER_STATUS <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("ORDER_STATUS like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("ORDER_STATUS not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("ORDER_STATUS in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("ORDER_STATUS not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("CREATE_DATE like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("CREATE_DATE not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(String value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(String value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(String value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(String value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLike(String value) {
            addCriterion("UPDATE_DATE like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotLike(String value) {
            addCriterion("UPDATE_DATE not like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<String> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<String> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(String value1, String value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(String value1, String value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andMachineNumberIsNull() {
            addCriterion("MACHINE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMachineNumberIsNotNull() {
            addCriterion("MACHINE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMachineNumberEqualTo(String value) {
            addCriterion("MACHINE_NUMBER =", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberNotEqualTo(String value) {
            addCriterion("MACHINE_NUMBER <>", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberGreaterThan(String value) {
            addCriterion("MACHINE_NUMBER >", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberGreaterThanOrEqualTo(String value) {
            addCriterion("MACHINE_NUMBER >=", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberLessThan(String value) {
            addCriterion("MACHINE_NUMBER <", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberLessThanOrEqualTo(String value) {
            addCriterion("MACHINE_NUMBER <=", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberLike(String value) {
            addCriterion("MACHINE_NUMBER like", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberNotLike(String value) {
            addCriterion("MACHINE_NUMBER not like", value, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberIn(List<String> values) {
            addCriterion("MACHINE_NUMBER in", values, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberNotIn(List<String> values) {
            addCriterion("MACHINE_NUMBER not in", values, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberBetween(String value1, String value2) {
            addCriterion("MACHINE_NUMBER between", value1, value2, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andMachineNumberNotBetween(String value1, String value2) {
            addCriterion("MACHINE_NUMBER not between", value1, value2, "machineNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("PAYMENT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("PAYMENT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(String value) {
            addCriterion("PAYMENT_TIME =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(String value) {
            addCriterion("PAYMENT_TIME <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(String value) {
            addCriterion("PAYMENT_TIME >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TIME >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(String value) {
            addCriterion("PAYMENT_TIME <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TIME <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLike(String value) {
            addCriterion("PAYMENT_TIME like", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotLike(String value) {
            addCriterion("PAYMENT_TIME not like", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<String> values) {
            addCriterion("PAYMENT_TIME in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<String> values) {
            addCriterion("PAYMENT_TIME not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(String value1, String value2) {
            addCriterion("PAYMENT_TIME between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_TIME not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNull() {
            addCriterion("BUSINESS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNotNull() {
            addCriterion("BUSINESS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeEqualTo(String value) {
            addCriterion("BUSINESS_CODE =", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotEqualTo(String value) {
            addCriterion("BUSINESS_CODE <>", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThan(String value) {
            addCriterion("BUSINESS_CODE >", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_CODE >=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThan(String value) {
            addCriterion("BUSINESS_CODE <", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_CODE <=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLike(String value) {
            addCriterion("BUSINESS_CODE like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotLike(String value) {
            addCriterion("BUSINESS_CODE not like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIn(List<String> values) {
            addCriterion("BUSINESS_CODE in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotIn(List<String> values) {
            addCriterion("BUSINESS_CODE not in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeBetween(String value1, String value2) {
            addCriterion("BUSINESS_CODE between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_CODE not between", value1, value2, "businessCode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}