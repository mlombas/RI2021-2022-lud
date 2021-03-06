package uo.ri.cws.application.persistence.workorder;

import java.util.List;
import java.util.Optional;

import uo.ri.cws.application.persistence.Gateway;

public interface WorkOrderGateway extends Gateway<WorkOrderRecord>{

	Optional<WorkOrderRecord> findByMechanicId(String id);
	
	void markAsInvoiced(String id);
	
	void linkToinvoice(String invoiceId, String workOrderId);
	
	List<WorkOrderRecord> findByVehicleId(String id);

}
