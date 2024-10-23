package com.kh.topgunFinal.vo;

import java.util.List;

import com.kh.topgunFinal.dto.PaymentDetailDto;
import com.kh.topgunFinal.dto.PaymentDto;

import lombok.Data;

@Data
public class PaymentTotalVO {
	private PaymentDto paymentDto;
	private List<PaymentDetailDto> paymentDetailList;
}