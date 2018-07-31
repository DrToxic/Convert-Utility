xres = GadgetWidth(Desktop())/2
yres = GadgetHeight(Desktop())/2

wind = CreateWindow("Convert Roman Numerals!",(xres)-200,(yres)-150,400,220,Desktop(),9)
CreateLabel("numbers (1 - 3999)",10,10,380,60,wind,3)
tex1 = CreateTextField(12,25,150,20,wind)
CreateLabel("roman Numerals",10,80,380,60,wind,3)
tex2 = CreateTextField(12,95,150,20,wind)
SetStatusText(wind,"Written by DrToxic")
Repeat

Select WaitEvent()
	Case $401
		Select EventSource()
			Case tex1
		;		Notify result$
				result$ = ToRoman$(TextFieldText(tex1))
				If result$ = False Then
					SetGadgetText(tex2,"Not a Roman Numeral")
				Else
					SetGadgetText(tex2,result$)
				EndIf
			Case tex2
		;		Stop
				result$ = FromRoman$(Upper(TextFieldText(tex2)))
				If result$ = False Then
					SetGadgetText(tex1,"Not a Number")
				Else
					SetGadgetText(tex1,result$)
				EndIf
			Default
			End Select		
	Case $803
		Exit
	Default
	
End Select

Forever

Function ToRoman$(in$)
	Include "Includes/Function ToRoman.bb"
End Function

Function FromRoman$(in$)
	Include "Includes/Function FromRoman.bb"
End Function