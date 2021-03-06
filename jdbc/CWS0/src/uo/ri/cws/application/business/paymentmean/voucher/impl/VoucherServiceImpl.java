package uo.ri.cws.application.business.paymentmean.voucher.impl;

import java.util.List;
import java.util.Optional;

import uo.ri.cws.application.business.BusinessException;
import uo.ri.cws.application.business.paymentmean.voucher.VoucherDto;
import uo.ri.cws.application.business.paymentmean.voucher.VoucherService;
import uo.ri.cws.application.business.paymentmean.voucher.VoucherSummaryDto;
import uo.ri.cws.application.business.paymentmean.voucher.impl.commands.FindVouchersByClientId;
import uo.ri.cws.application.business.paymentmean.voucher.impl.commands.GenerateVouchers;
import uo.ri.cws.application.business.paymentmean.voucher.impl.commands.GetvoucherSummary;
import uo.ri.cws.application.business.util.command.CommandExecutor;

public class VoucherServiceImpl implements VoucherService {
	
	private CommandExecutor ce = new CommandExecutor();

	@Override
	public int generateVouchers() throws BusinessException {
		return ce.execute(new GenerateVouchers());
	}

	@Override
	public Optional<VoucherDto> findVouchersById(String id) throws BusinessException {
		throw new RuntimeException("Not yet implemented");
	}

	@Override
	public List<VoucherDto> findVouchersByClientId(String id) throws BusinessException {
		return ce.execute(new FindVouchersByClientId(id));
	}

	@Override
	public List<VoucherSummaryDto> getVoucherSummary() throws BusinessException {
		return ce.execute(new GetvoucherSummary());
	}

}
