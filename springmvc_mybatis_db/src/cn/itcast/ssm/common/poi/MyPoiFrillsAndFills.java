/* ====================================================================
Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements.  See the NOTICE file distributed with
this work for additional information regarding copyright ownership.
The ASF licenses this file to You under the Apache License, Version 2.0
(the "License"); you may not use this file except in compliance with
the License.  You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
==================================================================== */

package cn.itcast.ssm.common.poi;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.FillPatternType;

/**
 * Shows how to use various fills.
 *
 * @author Glen Stampoultzis (glens at apache.org)
 */
public class MyPoiFrillsAndFills {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		try {
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet("new sheet");

			// Create a row and put some cells in it. Rows are 0 based.
			HSSFRow row = sheet.createRow(1);

			// Aqua background
			HSSFCellStyle style = wb.createCellStyle();
			style.setFillBackgroundColor(HSSFColor.AQUA.index);
			//style.setFillPattern(HSSFCellStyle.BIG_SPOTS)//;
			HSSFCell cell = row.createCell(0);
			cell.setCellValue("AQUA");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.AUTOMATIC.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(1);
			cell.setCellValue("AUTOMATIC");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.BLACK.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(2);
			cell.setCellValue("BLACK");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.BLUE.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(3);
			cell.setCellValue("BLUE");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.BLUE_GREY.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(4);
			cell.setCellValue("BLUE_GREY");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.BRIGHT_GREEN.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(5);
			cell.setCellValue("BRIGHT_GREEN");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.BROWN.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(6);
			cell.setCellValue("BROWN");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.CORAL.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(7);
			cell.setCellValue("CORAL");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.CORNFLOWER_BLUE.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(8);
			cell.setCellValue("CORNFLOWER_BLUE");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.DARK_BLUE.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(9);
			cell.setCellValue("DARK_BLUE");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.DARK_GREEN.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(10);
			cell.setCellValue("DARK_GREEN");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.DARK_RED.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(11);
			cell.setCellValue("DARK_RED");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.DARK_TEAL.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(12);
			cell.setCellValue("DARK_TEAL");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.DARK_YELLOW.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(13);
			cell.setCellValue("DARK_YELLOW");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.GOLD.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(14);
			cell.setCellValue("GOLD");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.GREEN.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(15);
			cell.setCellValue("GREEN");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
			style.setFillPattern(FillPatternType.BIG_SPOTS);
			cell = row.createCell(16);
			cell.setCellValue("GREY_25_PERCENT");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.GREY_40_PERCENT.index);
			style.setFillPattern(FillPatternType.BIG_SPOTS);
			cell = row.createCell(17);
			cell.setCellValue("GREY_40_PERCENT");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.GREY_50_PERCENT.index);
			style.setFillPattern(FillPatternType.BIG_SPOTS);
			cell = row.createCell(18);
			cell.setCellValue("GREY_50_PERCENT");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.GREY_80_PERCENT.index);
			style.setFillPattern(FillPatternType.BIG_SPOTS);
			cell = row.createCell(19);
			cell.setCellValue("GREY_80_PERCENT");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.INDIGO.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(20);
			cell.setCellValue("INDIGO");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.LAVENDER.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(21);
			cell.setCellValue("LAVENDER");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.LEMON_CHIFFON.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(22);
			cell.setCellValue("LEMON_CHIFFON");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.LIGHT_BLUE.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(23);
			cell.setCellValue("LIGHT_BLUE");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.LIGHT_CORNFLOWER_BLUE.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(24);
			cell.setCellValue("LIGHT_CORNFLOWER_BLUE");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.LIGHT_GREEN.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(25);
			cell.setCellValue("LIGHT_GREEN");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.LIGHT_ORANGE.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(26);
			cell.setCellValue("LIGHT_ORANGE");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.LIGHT_TURQUOISE.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(27);
			cell.setCellValue("LIGHT_TURQUOISE");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(28);
			cell.setCellValue("LIGHT_YELLOW");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.LIME.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(29);
			cell.setCellValue("LIME");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.MAROON.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(30);
			cell.setCellValue("MAROON");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.OLIVE_GREEN.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(31);
			cell.setCellValue("OLIVE_GREEN");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.ORANGE.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(32);
			cell.setCellValue("ORANGE");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.ORCHID.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(33);
			cell.setCellValue("ORCHID");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.PALE_BLUE.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(34);
			cell.setCellValue("PALE_BLUE");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.PLUM.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(35);
			cell.setCellValue("PLUM");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.RED.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(36);
			cell.setCellValue("RED");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.ROSE.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(37);
			cell.setCellValue("ROSE");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.ROYAL_BLUE.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(38);
			cell.setCellValue("ROYAL_BLUE");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.SEA_GREEN.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(39);
			cell.setCellValue("SEA_GREEN");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(40);
			cell.setCellValue("SKY_BLUE");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.TAN.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(41);
			cell.setCellValue("TAN");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.TEAL.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(42);
			cell.setCellValue("TEAL");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.TURQUOISE.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(43);
			cell.setCellValue("TURQUOISE");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.PINK.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(44);
			cell.setCellValue("PINK");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.VIOLET.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(45);
			cell.setCellValue("VIOLET");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.WHITE.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(46);
			cell.setCellValue("WHITE");
			cell.setCellStyle(style);

			// Orange "foreground", foreground being the fill foreground not the
			// font color.
			style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.YELLOW.index);
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell = row.createCell(47);
			cell.setCellValue("YELLOW");
			cell.setCellStyle(style);

			// Write the output to a file
			FileOutputStream fileOut = new FileOutputStream("workbook.xls");
			wb.write(fileOut);
			fileOut.close();
			wb.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
//HSSFWorkbook demoWorkBook = new HSSFWorkbook();
//HSSFSheet demoSheet = demoWorkBook.createSheet("The World's 500 Enterprises");
//HSSFCell cell = demoSheet.createRow(0).createCell(0);
//1.??????????????????????????????
//HSSFCellStyle cellStyle2 = demoWorkBook.createCellStyle();
//HSSFDataFormat format = demoWorkBook.createDataFormat();
//cellStyle2.setDataFormat(format.getFormat("@"));
//cell.setCellStyle(cellStyle2);
//????????????????????????
//           cell.setCellValue(new Date(2008,5,5));
//           //set date format
//           HSSFCellStyle cellStyle = demoWorkBook.createCellStyle();
//           HSSFDataFormat format= demoWorkBook.createDataFormat();
//           cellStyle.setDataFormat(format.getFormat("yyyy???m???d???"));
//           cell.setCellStyle(cellStyle);
//????????????????????????????????????
//           cell.setCellValue(1.2);
//           HSSFCellStyle cellStyle = demoWorkBook.createCellStyle();
//           cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00"));
//           cell.setCellStyle(cellStyle);
//????????????????????????
//           cell.setCellValue(20000);
//           HSSFCellStyle cellStyle = demoWorkBook.createCellStyle();
//           HSSFDataFormat format= demoWorkBook.createDataFormat();
//           cellStyle.setDataFormat(format.getFormat("??#,##0"));
//           cell.setCellStyle(cellStyle);
//???????????????????????????
//           cell.setCellValue(20);
//           HSSFCellStyle cellStyle = demoWorkBook.createCellStyle();
//           cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00%"));
//           cell.setCellStyle(cellStyle);
// ??????????????????????????????
//??????????????????????????????
//           cell.setCellValue(20000);
//           HSSFCellStyle cellStyle = demoWorkBook.createCellStyle();
//           HSSFDataFormat format= demoWorkBook.createDataFormat();
//           cellStyle.setDataFormat(format.getFormat("[DbNum2][$-804]0"));
//           cell.setCellStyle(cellStyle);
//?????????????????????????????????
//           cell.setCellValue(20000);
//           HSSFCellStyle cellStyle = demoWorkBook.createCellStyle();
//           cellStyle.setDataFormat( HSSFDataFormat.getBuiltinFormat("0.00E+00"));
//           cell.setCellStyle(cellStyle);

//
//HSSFCellStyle cellStyle= workbook.createCellStyle();
//HSSFDataFormat format = workbook.createDataFormat();
//cellStyle.setDataFormat(format.getFormat("@"));
//cell.setCellStyle(cellStyle);
//
//0, "General"
//1, "0"
//2, "0.00"
//3, "#,##0"
//4, "#,##0.00"
//5, "($#,##0_);($#,##0)"
//6, "($#,##0_);[Red]($#,##0)"
//7, "($#,##0.00);($#,##0.00)"
//8, "($#,##0.00_);[Red]($#,##0.00)"
//9, "0%"
//0xa, "0.00%"
//0xb, "0.00E+00"
//0xc, "# ?/?"
//0xd, "# ??/??"
//0xe, "m/d/yy"
//0xf, "d-mmm-yy"
//0x10, "d-mmm"
//0x11, "mmm-yy"
//0x12, "h:mm AM/PM"
//0x13, "h:mm:ss AM/PM"
//0x14, "h:mm"
//0x15, "h:mm:ss"
//0x16, "m/d/yy h:mm"
//// 0x17 - 0x24 reserved for international and undocumented 0x25, "(#,##0_);(#,##0)"
//0x26, "(#,##0_);[Red](#,##0)"
//0x27, "(#,##0.00_);(#,##0.00)"
//0x28, "(#,##0.00_);[Red](#,##0.00)"
//0x29, "_(*#,##0_);_(*(#,##0);_(* \"-\"_);_(@_)"
//0x2a, "_($*#,##0_);_($*(#,##0);_($* \"-\"_);_(@_)"
//0x2b, "_(*#,##0.00_);_(*(#,##0.00);_(*\"-\"??_);_(@_)"
//0x2c, "_($*#,##0.00_);_($*(#,##0.00);_($*\"-\"??_);_(@_)"
//0x2d, "mm:ss"
//0x2e, "[h]:mm:ss"
//0x2f, "mm:ss.0"
//0x30, "##0.0E+0"
//0x31, "@" - This is text format.
//0x31 "text" - Alias for "@"

//???????????????????????????????????????????????????????????????"@"??????????????????????????????HSSFDataFormat??????????????????0x31???49???????????????Date????????????????????????0xe-0x11??????????????????Date?????????""m/d/yy""??????HSSFDataFormat???????????????0xe???14??????
//????????????POI???Excel??????Cell?????????
//??????????????????Cell????????????????????????getCellType??????????????????Cell???????????????Excel???Cell???6??????????????????????????????
//Cell?????????
//CellType
//??????
//CELL_TYPE_BLANK
//??????
//CELL_TYPE_BOOLEAN
//?????????
//CELL_TYPE_ERROR
//??????
//CELL_TYPE_FORMULA
//?????????
//CELL_TYPE_STRING
//????????????
//CELL_TYPE_NUMERIC
//?????????
//???????????????CELL_TYPE_STRING???CELL_TYPE_NUMERIC??????????????????Excel??????????????????????????????????????????Cell???Type???CELL_TYPE_NUMERIC?????????????????????????????????Cell???????????????????????????????????????Date????????????Excel??????Date???????????????Double???????????????????????????Excel??????Date?????????????????????1900???1???1???????????????????????????????????????HSSFDateUtil???isCellDateFormatted??????????????????Cell????????????????????????Excel Date??????????????????????????????getDateCellValue?????????????????????Java?????????Date???
//????????????????????????????????????????????????CELL?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
//???????????????????????????????????????ExcelOut?????????createTableRow????????????????????????
//            HSSFCellStyle cellStyle2 = demoWorkBook.createCellStyle();
//            HSSFDataFormat format = demoWorkBook.createDataFormat();
//            cellStyle2.setDataFormat(format.getFormat("@"));
//            cell.setCellStyle(cellStyle2);
//????????????????????????????????????????????????CELL???????????????????????????
