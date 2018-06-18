-- Tabelas para o sistema de gestão de risco
-- Table: public.tb_cliente

-- DROP TABLE public.tb_cliente;

CREATE TABLE public.tb_cliente
(
    cliente_id bigint NOT NULL DEFAULT nextval('tb_cliente_cliente_id_seq'::regclass),
    nome character varying(150) COLLATE pg_catalog."default" NOT NULL,
    risco "char" NOT NULL,
    renda_mensal money NOT NULL,
    CONSTRAINT tb_cliente_pkey PRIMARY KEY (cliente_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.tb_cliente
    OWNER to postgres;

-- Table: public.tb_endereco

-- DROP TABLE public.tb_endereco;

CREATE TABLE public.tb_endereco
(
    endereco_id bigint NOT NULL DEFAULT nextval('tb_endereco_endereco_id_seq'::regclass),
    logradouro character varying(150) COLLATE pg_catalog."default" NOT NULL,
    numero integer NOT NULL,
    cep character varying(15) COLLATE pg_catalog."default" NOT NULL,
    cidade character varying(50) COLLATE pg_catalog."default" NOT NULL,
    estado character varying(80) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT tb_endereco_pkey PRIMARY KEY (endereco_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.tb_endereco
    OWNER to postgres;
    
    
-- Table: public.tb_cliente_endereco

-- DROP TABLE public.tb_cliente_endereco;

CREATE TABLE public.tb_cliente_endereco
(
    cliente_id bigint NOT NULL DEFAULT nextval('tb_cliente_endereco_cliente_id_seq'::regclass),
    endereco_id bigint NOT NULL DEFAULT nextval('tb_cliente_endereco_endereco_id_seq'::regclass),
    CONSTRAINT tb_cliente_endereco_pkey PRIMARY KEY (cliente_id, endereco_id),
    CONSTRAINT fk_cliente_id FOREIGN KEY (cliente_id)
        REFERENCES public.tb_cliente (cliente_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_endereco_id FOREIGN KEY (endereco_id)
        REFERENCES public.tb_endereco (endereco_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.tb_cliente_endereco
    OWNER to postgres;
    


