#!/bin/env bash

pushd src/main/java/com/jossemargt/cmsgalatea/model

echo "Make required @Version fields @Transient in model package"
find .  -type f -name '*.java' \
        -exec sed -i -e '/import javax.persistence.Version;/i import javax.persistence.Transient;' -e 's/@Version/@Version @Transient/' {} \;

echo "Change enumType to String for enum fields"
find .  -type f \( -name 'Contest.java' -o -name 'Task.java' \) \
        -exec sed -i -e '/import javax.persistence.Enumerated;/a import javax.persistence.EnumType;' -e 's/@Enumerated/@Enumerated/(EnumType.STRING/)/' {} \;

