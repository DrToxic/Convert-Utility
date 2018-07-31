Local number
Local temp$
	number = Float(in$)
	If number = 0 Or number > 3999 Then Return False
	While number>=1000 
		temp$=temp$+"M"
		number=number-1000
	Wend
	If number>=900 Then temp$=temp$+"CM"	:number=number-900
	If number>=500 Then temp$=temp$+"D"		:number=number-500
	If number>=400 Then temp$=temp$+"CD"	:number=number-400
	If number>=300 Then temp$=temp$+"CCC"	:number=number-300
	If number>=200 Then temp$=temp$+"CC"	:number=number-200
	If number>=100 Then temp$=temp$+"C"		:number=number-100
	If number>=90  Then temp$=temp$+"XC"	:number=number-90
	If number>=80  Then temp$=temp$+"LXXX"	:number=number-80
	If number>=70  Then temp$=temp$+"LXX"	:number=number-70
	If number>=60  Then temp$=temp$+"LX"	:number=number-60
	If number>=50  Then temp$=temp$+"L"		:number=number-50
	If number>=40  Then temp$=temp$+"XL"	:number=number-40
	If number>=30  Then temp$=temp$+"XXX"	:number=number-30
	If number>=20  Then temp$=temp$+"XX"	:number=number-20
	If number>=15  Then temp$=temp$+"XV"	:number=number-15
	If number>=10  Then temp$=temp$+"X"		:number=number-10
	If number>=9   Then temp$=temp$+"IX"	:number=number-9
	If number>=8   Then temp$=temp$+"VIII"	:number=number-8
	If number>=7   Then temp$=temp$+"VII"	:number=number-7
	If number>=6   Then temp$=temp$+"VI"	:number=number-6
	If number>=5   Then temp$=temp$+"V"		:number=number-5
	If number>=4   Then temp$=temp$+"IV"	:number=number-4
	If number>=3   Then temp$=temp$+"III"	:number=number-3
	If number>=2   Then temp$=temp$+"II"	:number=number-2
	If number>=1   Then temp$=temp$+"I"		:number=number-1
Return temp$