package com.parsedex.lib.struct;

import com.parsedex.lib.Utils;

public class CodeItem {
	
	/**
	 * struct code_item
		{
			ushort registers_size;
			ushort ins_size;
			ushort outs_size;
			ushort tries_size;
			uint debug_info_off;
			uint insns_size;
			ushort insns [ insns_size ];
			ushort paddding; // optional
			try_item tries [ tyies_size ]; // optional
			encoded_catch_handler_list handlers; // optional
		}
	 DexFile.h
	 struct DexCode {
	 u2  registersSize;
	 u2  insSize;
	 u2  outsSize;
	 u2  triesSize;
	 u4  debugInfoOff;       // file offset to debug info stream
	 u4  insnsSize;          // size of the insns array, in u2 units
	 u2  insns[1];
	/* followed by optional u2 padding */
	/* followed by try_item[triesSize] */
	/* followed by uleb128 handlersSize */
	/* followed by catch_handler_item[handlersSize]
       };

	 */
	
	public short registers_size;
	public short ins_size;
	public short outs_size;
	public short tries_size;
	public int debug_info_off;
	public int insns_size;
	public short[] insns;
	public int insnsOffset;
	
	@Override
	public String toString(){
		return "regsize:"+registers_size+",ins_size:"+ins_size
				+",outs_size:"+outs_size+",tries_size:"+tries_size+",debug_info_off:"+debug_info_off
				+",insns_size:"+insns_size + "\ninsns:"+getInsnsStr();
	}
	
	private String getInsnsStr(){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<insns.length;i++){
			sb.append(Utils.bytesToHexString(Utils.short2Byte(insns[i]))+",");
		}
		return sb.toString();
	}
	
}
