FROM openjdk:8
ARG PROFILE

ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS={ADDITIONAL_OPTS}

WORKDIR /opt/spring_boot

COPY /target/Docker2-*.jar Docker2.jar

SHELL ["/bin/sh","-c"]

EXPOSE 55005
EXPOSE 8080

CMD java ${ADDITIONAL_OPTS} -jar Docker2.jar --spring.profiles.active={PROFILE}