package io.github.khkim6040.contract.api

import io.github.khkim6040.contract.domain.ContractRepository
import io.github.khkim6040.contract.domain.InMemoryContractRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration(proxyBeanMethods = false)
class ApiConfig {
    @Bean
    fun contractRepository(): ContractRepository = InMemoryContractRepository()
}
