package com.parsedex.lib.struct;

import com.parsedex.lib.Utils;

public class TypeIdsItem {
	
	/**
	 * struct type_ids_item
		{
		uint descriptor_idx;
		}
	 */
	
	public int descriptor_idx;
	
	public static int getSize(){
		return 4;
	}
	
	@Override
	public String toString(){
		return Utils.bytesToHexString(Utils.int2Byte(descriptor_idx));
	}

}
