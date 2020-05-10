/*
 * NacaRTTests - Naca Tests for NacaRT support.
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Publicitas SA.
 * Licensed under GPL (GPL-LICENSE.txt) license.
 */
import nacaLib.varEx.*;
import nacaLib.callPrg.CalledProgram;
import nacaLib.program.*;

/**
 * @author U930DI
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TestCalled extends CalledProgram
{
	public nacaLib.varEx.DataSection WorkingStorage = declare.workingStorageSection();
	
	public Var WSFill = declare.level(1).picX(52).var();
	
	public DataSection LinkageSection = declare.linkageSection();
		public Var LSRoot = declare.level(1).var();
			public Var LSResult = declare.level(2).pic9(4).var();
			public Var LSV1 = declare.level(2).pic9(3).var();
			public Var LSV2 = declare.level(2).pic9(3).var();
	
		public ParamDeclaration c = declare.using(LSRoot);
		
	public Paragraph Main = new Paragraph(this){public void run(){Main();}};void Main()
	{
		add(LSV1, LSV2).to(LSResult);
		assertIfDifferent(31, LSResult);
	}	
}
