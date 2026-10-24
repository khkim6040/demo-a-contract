package io.github.khkim6040.contract.domain

enum class ContractEventType { CREATED, SUSPENDED, EXPIRED, BENEFICIARY_CHANGED }

data class ContractEvent(
    val eventId: String,
    val contractId: String,
    val type: ContractEventType,
    val beneficiary: String? = null,
)
