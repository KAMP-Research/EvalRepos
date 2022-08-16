package edu.kit.ipd.sdq.kamp4aps.core;

import domain.as.Component;
import domain.as.Interface;
import domain.as.Structure;
import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
import quality.as_foaa.CalibrationConfiguration;
import quality.as_foaa.ComponentStockList;
import quality.as_foaa.Drawing;
import quality.as_foaa.HMIConfiguration;
import quality.as_foaa.InterfaceStockList;
import quality.as_foaa.MainteneanceDocumentation;
import quality.as_foaa.ModuleStockList;
import quality.as_foaa.OperatorInstructions;
import quality.as_foaa.StructureStockList;
import quality.as_foaa.TestCase;
import quality.as_foaa.TrainingDocExternal;
import quality.as_foaa.TrainingDocIntern;

/**
 * This class represents the elements an activity can affect.
 * We distinct between aPS related elements and annotation related
 * activities. APS related activities are caused by architectural
 * changes in the system under analysis also known as structural
 * changes. While annotation related activities are caused by changes 
 * in the non-structural part of the system.
 * 
 * @author Sandro Koch
 * @see AbstractActivityElementType
 */
public enum APSActivityElementType implements AbstractActivityElementType {
	//aPS related
	COMPONENT(Component.class),
	MODULE(Module.class),
	STRUCTURE(Structure.class),
	INTERFACE(Interface.class),
	
	// annotation-related
	TESTCASE(TestCase.class),
	MAINTENEANCE_DOCUMENTATION(MainteneanceDocumentation.class),
	OPERATOR_INSTRUCTIONS(OperatorInstructions.class),
	TRAINING_DOCUMENTATION_INTERNAL(TrainingDocIntern.class),
	TRAINING_DOCUMENTATION_EXTERNAL(TrainingDocExternal.class),
	DRAWING(Drawing.class),
	HMI_CONFIG(HMIConfiguration.class),
	CALIBRATION_CONFIG(CalibrationConfiguration.class),
	
	COMPONENT_STOCKLIST(ComponentStockList.class),
	MODULE_STOCKLIST(ModuleStockList.class),
	INTERFACE_STOCKLIST(InterfaceStockList.class),
	STRUCTURE_STOCKLIST(StructureStockList.class),

	GLOBAL_VARIABLE_TYPE(GlobalVariable.class);
	
	private final Class<?> clazz;
	private final String name;
	
	private APSActivityElementType(Class<?> clazz) {
		this.clazz = clazz;
		this.name = clazz.getSimpleName();
	}

	@Override
	public Class<?> getElementClass() {
		return clazz;
	}
	
	@Override
	public String getName() {
		return name;
	}

	public static APSActivityElementType[] topLevelAPSActivityElementTypes() {	
		return new APSActivityElementType[]{COMPONENT, MODULE, INTERFACE, STRUCTURE};
	}

}
