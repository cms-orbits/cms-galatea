@echo off
title Roo generated entities tweaks

echo Make required @Version fields @Transient in model package
setlocal
pushd src\main\java\com\jossemargt\cmsgalatea\model
for /F "tokens=*" %%A in ('dir /A-D /B ^| findstr /E .java') do @sed -i -e '/import javax.persistence.Version;/i import javax.persistence.Transient;' -e 's/@Version/@Version @Transient/' %%A
endlocal

echo Change enumType to String for enum fields
setlocal
pushd src\main\java\com\jossemargt\cmsgalatea\model
for %%A in ('Contest.java Task.java') do @sed -i -e '/import javax.persistence.Enumerated;/a import javax.persistence.EnumType;' -e 's/@Enumerated/@Enumerated\(EnumType.STRING\)/' %%A
endlocal