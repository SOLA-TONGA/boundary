/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.wsclients;

import java.util.List;
import javax.jws.WebParam;
import org.sola.webservices.transferobjects.ValidationResult;
import org.sola.webservices.transferobjects.transaction.TransactionBulkOperationSpatialTO;
import org.sola.webservices.transferobjects.transaction.TransactionBulkOperationSourceTO;

/**
 *
 * @author Elton Manoku
 */
public interface BulkOperationsClient extends AbstractWSClient {

    /**
     * Bulkoperations. - Service name prefix for the Cadastre Web Service
     */
    public static final String SERVICE_NAME = "BulkOperations.";
    /**
     * BulkOperations.checkConnection - Identifier for the checkConnection
     * method
     */
    public static final String CHECK_CONNECTION = SERVICE_NAME + "checkConnection";
    /**
     * BulkOperations.checkConnection - Identifier for the checkConnection
     * method
     */
    public static final String REJECT_TRANSACTION = SERVICE_NAME + "rejectTransaction";
    /**
     * BulkOperations.getTransactionBulkOperationSpatial - Identifier for the
     * getTransactionBulkOperationSpatial method
     */
    public static final String GET_TRANSACTION_BULK_OPERATION_SPATIAL =
            SERVICE_NAME + "getTransactionBulkOperationSpatial";
    /**
     * BulkOperations.saveTransactionBulkOperationSpatial - Identifier for the
     * saveTransactionBulkOperationSpatial method
     */
    public static final String SAVE_TRANSACTION_BULK_OPERATION_SPATIAL =
            SERVICE_NAME + "saveTransactionBulkOperationSpatial";
    /**
     * BulkOperations.saveTransactionBulkOperationSource - Identifier for the
     * saveTransactionBulkOperationSource method
     */
    public static final String SAVE_TRANSACTION_BULK_OPERATION_SOURCE =
            SERVICE_NAME + "saveTransactionBulkOperationSource";
    /**
     * BulkOperations.getBulkLoadProgressMessage - Identifier for the
     * getBulkLoadProgressMessage method
     */
    public static final String GET_BULK_LOAD_PROGRESS_MESSAGE =
            SERVICE_NAME + "getBulkLoadProgressMessage";
    /**
     * BulkOperations.loadDocuments - Identifier for the loadDocuments method
     */
    public static final String LOAD_DOCUMENTS =
            SERVICE_NAME + "loadDocuments";
    /**
     * BulkOperations.cancelLoad - Identifier for the cancelLoad method
     */
    public static final String CANCEL_LOAD =
            SERVICE_NAME + "cancelLoad";

    /**
     * It rejects a bulk operation by removing the uploaded records.
     */
    boolean rejectTransaction(String transactionId, int rowVersion);

    /**
     * It creates or updates a bulk operation spatial transaction.
     *
     * @param transactionTO The transaction to create/save.
     * @return A list of validation results.
     */
    List<ValidationResult> saveTransactionBulkOperationSpatial(
            TransactionBulkOperationSpatialTO transactionTO);

    /**
     * Gets a transaction of bulk operation.
     *
     * @param transactionId The identifier of the transaction
     */
    TransactionBulkOperationSpatialTO getTransactionBulkOperationSpatial(String transactionId);

    /**
     * It creates or updates a bulk operation source transaction.
     *
     * @param transactionTO The transaction to create/save.
     * @return A list of validation results.
     */
    List<ValidationResult> saveTransactionBulkOperationSource(
            TransactionBulkOperationSourceTO transactionTO);

    /**
     * Loads documents from the specified a folder on the computer hosting the
     * SOLA Services. Documents in the subfolders are also loaded. Every
     * document is given the same document type.
     *
     * Documents are loaded independently of a transaction to prevent rollback
     * of load if an exception occurs.
     *
     * @param docType The type of document to load. Must be a value from
     * source.adminstrative_source_type
     * @param sourceFolder The source folder to load the documents from. Must be
     * a folder on the computer hosting the SOLA Services. This version of the
     * method does not currently support loading documents from a shared folder
     * on another computer
     * @return The final set of progress messages.
     */
    String loadDocuments(String docType, String sourceFolder);

    /**
     * Returns the current progressMessage. Avoid using any transaction so that
     * the progress message can be obtained at any state of the bulk load
     * process
     */
    String getBulkLoadProgressMessage();

    /**
     * Sets a flag that will cancel the load process
     */
    void cancelLoad();
}
